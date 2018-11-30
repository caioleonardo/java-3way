package br.com.primefaces;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class ImagesView {
	private String option;
	
	private List<String> images;

	@PostConstruct
	public void init() {
		images = new ArrayList<String>();
		carregarJogosXbox();
		carregarJogosPS4();
	}

	private void carregarJogosPS4() {
		for (int i = 1; i <= 5; i++) {
			images.add("jogoPS4" + i + ".jpg");
		}
	}

	private void carregarJogosXbox() {
		for (int i = 1; i <= 5; i++) {
			images.add("nature" + i + ".jpg");
		}
	}

	public List<String> getImages() {
		return images;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		String mensagem = "";
		if (option != null && !option.equals("")) {
			images = new ArrayList<String>();
			if (option.equals("nature")) {
				carregarJogosXbox();
			} else if (option.equals("PS4")) {
				carregarJogosPS4();
			}
			mensagem = "Plataforma selecionada com sucesso";
		} else {
			mensagem = "Todas as plataformas selecionadas";
	} 
	FacesContext context = FacesContext.getCurrentInstance();
	context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", mensagem));
this.option = option;
	}
}
