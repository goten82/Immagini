
public class ProvaManipolatoreImmagine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ManipolatoreDiImmagine mdi= new ManipolatoreDiImmagine("C:\\Users\\Giuseppe\\Desktop\\immagine.png");
		ManipolatoreDiImmagine mdi= new ManipolatoreDiImmagine("C:\\Users\\Utente\\Desktop\\GiuseppeEcipa\\EsercitazioniJava\\immagine.png");
//		int r1 = 255; //in.readInt("Inserisci la componente rossa da sostituire");
//		int g1 = 255; //in.readInt("Inserisci la componente verde da sostituire");
//		int b1 = 255; //in.readInt("Inserisci la componete blu da sostituire");
//		Colore col1= new Colore(r1,g1,b1);
//		
//		int r2 = 125; //in.readInt("Inserisci la componente rossa sostituta");
//		int g2 = 125; //in.readInt("Inserisci la componente verde sostituta");
//		int b2 = 125; //in.readInt("Inserisci la componete blu sostituta");		
//		Colore col2=new Colore(r2,g2,b2);
//		int i1=100;
//		int i2=200;
//		int j1=100;
//		int j2=200;
		boolean orizz=true;
		
//		mdi.aggiungiTrasformazione(new Taglio(i1,j1,i2,j2));
//		mdi.aggiungiTrasformazione(new CambioColore(col1, col2));
		mdi.aggiungiTrasformazione(new Riflessione(orizz));
		
		mdi.trasforma();
//		mdi.scriviSuFile("C:\\Users\\Giuseppe\\Desktop\\immagine_rifless.png");
		mdi.scriviSuFile("C:\\Users\\Utente\\Desktop\\GiuseppeEcipa\\EsercitazioniJava\\immagine_rifl.jpg");
		System.out.println("Finita la trasformazione");

	}

}
