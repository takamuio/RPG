package Models;

public class Dialogo {
	String texto;

	public void BoasVindasDoMago() {
		texto = "Bem-vindos Aventureiros";
	}

	public void DignoParaMissao() {
		texto = "Toque na minha bola de cristal. \n" + "Se for digno o bastante para esta miss�o a esfera me revelar�.";
	}

	public void EscolherBolaDeCristral() {
		texto = "Voc� � digno ! \n" + "Um aventureiro digno da miss�o que eu tenho a confiar� \n" + "Ajudante ! \n"
				+ "Diga que as entrevistas est�o encerradas. \n" + "Muito bem guerreiros, vamos tratar de neg�cios�";
	}

	public void NaoEscolherBolaDeCristal() {
		texto = "� uma pena que n�o desejem tocar a bola. \n" + "Nunca saber�o se s�o ou n�o dignos� \n"
				+ "N�o tenho mais o que tratar com voc�s... \n" + "Podem ir... ";
	}

	public void AposLutaComGobblins() {
		texto = "Estranho... \n" + "Esses Hobgoblins pareciam  cansados  e  famintos. \n"
				+ "Quase  n�o  carregavam  nenhum  equipamento e pelo menos um deles j� estava ferido, com um bra�o quebrado. \n"
				+ "Estava com o bra�o quebrado  h� pelo menos uma semana. \n"
				+ "Eles estavam fugindo de algu�m ou de alguma coisa realmente terr�vel.";
	}

	public void PagarOPedagio() {
		texto = "Auto l� ! \n" + "Antes de passar pela ponte voc�s tem de pagar o ped�gio ! \n"
				+ "O pre�o � de uma moeda de ouro por pessoa";
	}

	public void AjudarOsAldeoes() {
		texto = "Muito obrigado por ajudar ! \n"
				+ "A nossa fazenda fica mais ao leste, dois ou tr�s dias de viagem perto das montanhas. \n"
				+ "Ela foi atacada por terr�veis esqueletos. \n"
				+ "Na primeira noite mataram muitas pessoas e levaram os corpos.\n"
				+ "N�s n�o esperaramos por um novo ataque !\n"
				+ "Runiramos tudo o que tinhamos de  valor e fugiramos. ";
	}

	public void ConversarComOsElfos() {
		texto = "N�o tiveramos muita sorte  ca�ando numa regi�o mais ao noroeste ! \n"
				+ "Perto das montanhas. N�o havia qualquer ca�a l�. \n"
				+ "Era como se  alguma coisa tivesse espantado todos os animais.";
	}

	public void ConversarComOGuerreiro() {
		texto = "Estou  voltando para casa, no norte, depois de dez anos de servi�os no ex�rcito de um duque local. \n"
				+ "Ouvi muitos relatos de viajantes sobre uma for�a sombria que est� ganhando forma e corpo no leste. \n"
				+ "Mesmo eu sendo um guerreiro experiente, evito tais criaturas. \n"
				+ "E n�o tenho nenhum interesse em participar de qualquer empreitada que seja neste sentido. \n"
				+ "Tudo o que eu quero � chegar em casa e usufruir da sminha aposentadoria.";
	}

	public void ConversarComOsHalflings() {
		texto = "O que ? mortos-vivos !! \n" + "Ainda bem que n�o encontramos com eles."
				+ "Muito obrigado por nos alertar.";
	}

	public void OuvirODuque() {
		texto = " Socorro !!! Socorro !!! \n" + "Minha esposa est�  para  ser enforcada  por  bandidos. \n"
				+ "Eu consegui fugir pela escurid�o. \n" + "Mas preciso de ajuda !";
	}

	public void GuardasReaisNaChuva() {
		texto = "� perigoso seguir a diante ! \n"
				+ "Sugiro que voc� d�em a volta por uma estrada secund�ria ou esperem aqui no posto at� que a chuva passe";
	}

	public void PegandoMissaoComOMago() {
		texto = "Durante as �ltimas semanas temos registrado um crescente n�mero de ocorr�ncias, \n"
				+ "relacionadas a ataques de mortos-vivos nesta regi�o. \n"
				+ "Enviamos algumas tropas de soldados do rei, mas eles se mostraram incapazes de resolver o ocorrido. \n"
				+ "Tamb�m n�o estavam preparados para o combate com criaturas m�sticas como mortos-vivos... \n"
				+ "Por isso eu vim at� essa cidade. Para achar voc�s. \n"
				+ "O Globo M�gico s� seleciona pessoas de �ndole boa e capazes de resolver este problema. \n"
				+ "Eu quero que voc�s viajem para o leste, como comissionados do rei em pessoa. \n"
				+ "Ter�o autoridade como se fossem homens do protetorado real.";
	}

	public void PegandoBolaDeCristalComMago() {
		texto = "E a voc� jovem eu confio isto. Uma bola de cristal, um pouco menor que a minha. \n"
				+ "Com ela voc� poder� se comunicar comigo uma vez por dia, n�o importa o qu�o distante estejamos um do outro. \n"
				+ "Para usar a bola voc� deve se concentrar em mim e deixar bola ser banhada pela luz do luar. \n"
				+ "Mas cuidado. Esta bola � muito fr�gil. Se ela for quebrada, explodir� com a for�a de uma tempestade! \n"
				+ "Eu confio em voc�s...";
	}

	public void AntesDaLutarComDragao() {
		texto = "... Tolos... \n" + "Aqui voc�s s� encontrar�o sua pr�pria destrui��o e morte. \n"
				+ "Nenhum ser vivo pode adentrar os dom�nios de Melkaia, o drag�o das n�voas e sair vivo... \n"
				+ "logo voc�s se juntar�o ao meu ex�rcito de mortos vivos!";
	}

	public void AposLutarComDragao() {
		texto = "Tolos... \n"
				+ "Voc�s podem ter me derrotado por enquanto, mas eu voltarei para me vingar de voc�s... \n"
				+ "Eu prometo�";
	}

}
