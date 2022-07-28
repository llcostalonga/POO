package br.ufes.llcostalonga.lab10.filemonitor;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AppSharedArena implements  PropertyChangeListener {

	
	
	public AppSharedArena(String dir) throws InterruptedException {
		MeuMonitorArquivos monitor = new MeuMonitorArquivos(dir);
		monitor.addListener(this);
		monitor.iniciarMonitoramento();
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("Novo arquivo encontrado:" + evt.getNewValue());		
	}
	
	public static void main(String[] args) {
		try {
			AppSharedArena arena = new AppSharedArena("C:\\Users\\llcos\\downloads\\test\\");
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
