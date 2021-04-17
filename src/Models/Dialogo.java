package Models;

public class Dialogo {
	String texto;

	public void BoasVindasDoMago() {
		texto = "Bem-vindos Aventureiros";
	}

	public void DignoParaMissao() {
		texto = "Toque na minha bola de cristal. \n" + "Se for digno o bastante para esta missão a esfera me revelará.";
	}

	public void EscolherBolaDeCristral() {
		texto = "Você é digno ! \n" + "Um aventureiro digno da missão que eu tenho a confiar… \n" + "Ajudante ! \n"
				+ "Diga que as entrevistas estão encerradas. \n" + "Muito bem guerreiros, vamos tratar de negócios…";
	}

	public void NaoEscolherBolaDeCristal() {
		texto = "É uma pena que não desejem tocar a bola. \n" + "Nunca saberão se são ou não dignos… \n"
				+ "Não tenho mais o que tratar com vocês... \n" + "Podem ir... ";
	}

	public void AposLutaComGobblins() {
		texto = "Estranho... \n" + "Esses Hobgoblins pareciam  cansados  e  famintos. \n"
				+ "Quase  não  carregavam  nenhum  equipamento e pelo menos um deles já estava ferido, com um braço quebrado. \n"
				+ "Estava com o braço quebrado  há pelo menos uma semana. \n"
				+ "Eles estavam fugindo de alguém ou de alguma coisa realmente terrível.";
	}

	public void PagarOPedagio() {
		texto = "Auto lá ! \n" + "Antes de passar pela ponte vocês tem de pagar o pedágio ! \n"
				+ "O preço é de uma moeda de ouro por pessoa";
	}

	public void AjudarOsAldeoes() {
		texto = "Muito obrigado por ajudar ! \n"
				+ "A nossa fazenda fica mais ao leste, dois ou três dias de viagem perto das montanhas. \n"
				+ "Ela foi atacada por terríveis esqueletos. \n"
				+ "Na primeira noite mataram muitas pessoas e levaram os corpos.\n"
				+ "Nós não esperaramos por um novo ataque !\n"
				+ "Runiramos tudo o que tinhamos de  valor e fugiramos. ";
	}

	public void ConversarComOsElfos() {
		texto = "Não tiveramos muita sorte  caçando numa região mais ao noroeste ! \n"
				+ "Perto das montanhas. Não havia qualquer caça lá. \n"
				+ "Era como se  alguma coisa tivesse espantado todos os animais.";
	}

	public void ConversarComOGuerreiro() {
		texto = "Estou  voltando para casa, no norte, depois de dez anos de serviços no exército de um duque local. \n"
				+ "Ouvi muitos relatos de viajantes sobre uma força sombria que está ganhando forma e corpo no leste. \n"
				+ "Mesmo eu sendo um guerreiro experiente, evito tais criaturas. \n"
				+ "E não tenho nenhum interesse em participar de qualquer empreitada que seja neste sentido. \n"
				+ "Tudo o que eu quero é chegar em casa e usufruir da sminha aposentadoria.";
	}

	public void ConversarComOsHalflings() {
		texto = "O que ? mortos-vivos !! \n" + "Ainda bem que não encontramos com eles."
				+ "Muito obrigado por nos alertar.";
	}

	public void OuvirODuque() {
		texto = " Socorro !!! Socorro !!! \n" + "Minha esposa está  para  ser enforcada  por  bandidos. \n"
				+ "Eu consegui fugir pela escuridão. \n" + "Mas preciso de ajuda !";
	}

	public void GuardasReaisNaChuva() {
		texto = "É perigoso seguir a diante ! \n"
				+ "Sugiro que você dêem a volta por uma estrada secundária ou esperem aqui no posto até que a chuva passe";
	}

	public void PegandoMissaoComOMago() {
		texto = "Durante as últimas semanas temos registrado um crescente número de ocorrências, \n"
				+ "relacionadas a ataques de mortos-vivos nesta região. \n"
				+ "Enviamos algumas tropas de soldados do rei, mas eles se mostraram incapazes de resolver o ocorrido. \n"
				+ "Também não estavam preparados para o combate com criaturas místicas como mortos-vivos... \n"
				+ "Por isso eu vim até essa cidade. Para achar vocês. \n"
				+ "O Globo Mágico só seleciona pessoas de índole boa e capazes de resolver este problema. \n"
				+ "Eu quero que vocês viajem para o leste, como comissionados do rei em pessoa. \n"
				+ "Terão autoridade como se fossem homens do protetorado real.";
	}

	public void PegandoBolaDeCristalComMago() {
		texto = "E a você jovem eu confio isto. Uma bola de cristal, um pouco menor que a minha. \n"
				+ "Com ela você poderá se comunicar comigo uma vez por dia, não importa o quão distante estejamos um do outro. \n"
				+ "Para usar a bola você deve se concentrar em mim e deixar bola ser banhada pela luz do luar. \n"
				+ "Mas cuidado. Esta bola é muito frágil. Se ela for quebrada, explodirá com a força de uma tempestade! \n"
				+ "Eu confio em vocês...";
	}

	public void AntesDaLutarComDragao() {
		texto = "... Tolos... \n" + "Aqui vocês só encontrarão sua própria destruição e morte. \n"
				+ "Nenhum ser vivo pode adentrar os domínios de Melkaia, o dragão das névoas e sair vivo... \n"
				+ "logo vocês se juntarão ao meu exército de mortos vivos!";
	}

	public void AposLutarComDragao() {
		texto = "Tolos... \n"
				+ "Vocês podem ter me derrotado por enquanto, mas eu voltarei para me vingar de vocês... \n"
				+ "Eu prometo…";
	}

}
