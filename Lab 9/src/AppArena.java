import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class AppArena {
	Personagem[] personagens;
	
	public AppArena(int qtdPersonagens) {
		personagens = new Personagem[qtdPersonagens];
		for (int i = 0; i < personagens.length; i++) {
			
			int tipoPersonagem = (int)(Math.random() * 3);
			
			if(tipoPersonagem ==0 )	personagens[i] = new Lutador();
			else if(tipoPersonagem ==1 )	personagens[i] = new Gladiador();
			else if(tipoPersonagem ==2 )	personagens[i] = new Fera();
		}
	}
	
	public AppArena(String csvFilePath) {
		ArrayList<Personagem> personagens = new ArrayList(); 
		
		String line = "";
		String splitBy = ";";
		try {
			//parsing a CSV file into BufferedReader class constructor  
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\csvDemo.csv"));
			BufferedReader br = new BufferedReader(new FileReader(csvFilePath));
			while ((line = br.readLine()) != null)
				//returns a Boolean value  
			{
				String[] data = line.split(splitBy);
				if(data[0].equalsIgnoreCase("Fera")) {
					Personagem fera = new Fera(data[1], Double.valueOf(data[2]).doubleValue());
					personagens.add(fera);
				}else {
					if(data[0].equalsIgnoreCase("Gladiador")) {
						Gladiador gladiador = new Gladiador(data[1], Double.valueOf(data[2]).doubleValue());
												
						//Verifica se já existe o gladiador (necessário implementar equals em Personagem)
						int index = personagens.indexOf(gladiador);
						if(index == -1) {
							personagens.add(gladiador);
						}else {
							gladiador = (Gladiador)personagens.get(index);
						}
						
						//cadastro de armas
						if(data.length == 6) {
							String descicaoArma = data[3];
							String nomeGolpe = data[4];
							double poderOfensivo = Double.valueOf(data[5]).doubleValue();
													
							//Verifica se arma já foi criada					
							Arma arma = gladiador.getArma(descicaoArma);
							if(arma == null) arma = new Arma(descicaoArma);
							
							arma.addGolpe(nomeGolpe, poderOfensivo);	
							gladiador.addArma(arma);
							
						}
						
						//cadastro de armaduras
						if(data.length == 9) {
							String descicaoArmadura = data[6];
							double poderDefensivo = Double.valueOf(data[7]).doubleValue();
							double estadoConservacao = Double.valueOf(data[8]).doubleValue();
																									
							Armadura armadura = new Armadura(descicaoArmadura,poderDefensivo,estadoConservacao);
							gladiador.addArmadura(armadura);
							
						}

					}else {
						if(data[0].equalsIgnoreCase("Lutador")) {
							Personagem lutador = new Lutador(data[1], Double.valueOf(data[2]).doubleValue());
							personagens.add(lutador);
						}
						
					}
				}
				
				
			}
			this.personagens = new Personagem[personagens.size()];
			personagens.toArray(this.personagens); //converte arraylist para vetor.
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	public AppArena(Personagem[] personagens) {
		super();
		this.personagens = personagens;
	}
	
	public int getQtdPersonagemVivos() {
		int retorno = 0;
		for (int i = 0; i < personagens.length; i++) {
			retorno += personagens[i].estaVivo()? 1:0;
		}
		return retorno;
	}
	
	
	public int getIndiceProximoVivo(int index) {
		int i = index;
		while (i != (index -1)) {
			if(i > (personagens.length - 1)) 
				i = 0;
			if(personagens[i].estaVivo()) return i;
			i++;
		}
		return -1;
	}
	
	private void realizarCombate(Personagem p1, Personagem p2) {
		System.out.println("Combate em andamento:" + p1 +" vs. " + p2);
		while (p1.estaVivo() && p2.estaVivo()) {
			p1.atacar(p2);
			if(p2.estaVivo()) {
				p2.atacar(p1);
			}
						
		}
		Personagem vencedor= p1.estaVivo()?p1:p2;
	
		if ((p1 instanceof Gladiador)&&(p2 instanceof Gladiador)) { 
				Personagem perdedor= p1.estaVivo()?p2:p1;
				((Gladiador)vencedor).addArmas(((Gladiador)perdedor).armas);
				((Gladiador)vencedor).addArmaduras(((Gladiador)perdedor).armaduras);
			System.out.println("arsenal transferido");
		}
		
		
		System.out.println("Combate encerrado! Vencedor:" + vencedor);
	}
 	
	private void listarCombatentes() {
		System.out.println("Combatentes:");
		for (int i = 0; i < personagens.length; i++) {
			System.out.println(" "+ i + ": " + personagens[i]);
		}
	}
	
	private Personagem getCampeao() {
		for (int i = 0; i < personagens.length; i++) {
			if(personagens[i].estaVivo()) return personagens[i];
		}
		return null;
	}
	
	public void iniciarCombates() {
		listarCombatentes();
		int index = 0;
		while (getQtdPersonagemVivos() > 1) {
			int posP1 = getIndiceProximoVivo(index);
			Personagem p1 = personagens[posP1];
			index = posP1 + 1;
				
			int posP2 = getIndiceProximoVivo(index);	
			
			if(posP2 != -1) {
				Personagem p2 = personagens[posP2];
				index = posP2+1;
				realizarCombate(p1,p2);				
			}
			
					
			//index = index==personagens.length?0:index+1;
			
		}
		System.out.println("Fim dos Combates. Campeão do torneio:" + getCampeao());
		
	}
	
	public static void main(String[] args) {
	   //AppArena arena = new AppArena(6);
	   
		String filePath;
		
		//filePath = "./src/main/java/arquivoArena.csv";
		filePath = "./res/arquivoArena.csv";
		
		//Opcao 2
		//URL path = AppArena.class.getResource("arquivoArena.csv");  		
		//filePath = path.toString();
		
		//Opção 2		
		/*JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
		fc.showOpenDialog(null);
		File file = fc.getSelectedFile();
		String filePathString = file.getAbsolutePath();*/
		
		
		
	   AppArena arena =  new AppArena(filePath);
	   arena.iniciarCombates();
	   
   }

}
