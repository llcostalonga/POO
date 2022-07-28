package br.ufes.llcostalonga.lab10.filemonitor;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeuMonitorArquivos {

	String diretorio;
	List arquivosPrevios;
	private PropertyChangeSupport fofoqueiro;
	
	public MeuMonitorArquivos(String diretorio) {
		this.diretorio = diretorio;
		fofoqueiro = new PropertyChangeSupport(this);
		arquivosPrevios = new ArrayList();
	}
	
	public void addListener(PropertyChangeListener listener) {
		fofoqueiro.addPropertyChangeListener(listener);
	}
	
	public void iniciarMonitoramento() throws InterruptedException {
		long timeOut = 0;
		File dir = new File(diretorio);
		
		if(!dir.isDirectory()) {
			System.out.println("Diretório não encontrado.");
			return;
		}
		
		while(timeOut < 30000) {
			FilenameFilter filter = (d, name) -> name.endsWith(".csv");
			File files[] = dir.listFiles(filter);
			
			List arquivos = Arrays.asList(files);
			
			if(arquivos.size() == arquivosPrevios.size()) {
				Thread.sleep(1000);
				timeOut+=1000;
			}else {
				timeOut = 0;
				//Arrays.asList(files);
				
				List<File> differences = new ArrayList<>(arquivos);
				differences.removeAll(arquivosPrevios);
				
				for (File file : differences) {
					 fofoqueiro.firePropertyChange( new PropertyChangeEvent(file,"filePath","",file.getAbsolutePath()));
				}
				arquivosPrevios = Arrays.asList(files);
			}				        
		}
	}	
}
