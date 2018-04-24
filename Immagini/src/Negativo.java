
public class Negativo implements Trasformazione {

	@Override
	public Immagine trasforma(Immagine img) {
		Immagine img2= new Immagine(img.larghezza(),img.altezza());
		//Colore c;
		//Colore c2;
		for(int i=0;i<img.altezza();i++) {
			for(int j=0;j<img.larghezza();j++) {			
				Colore c=img.getPixel(i, j);
				Colore c2= new Colore(255-c.getRed(),255-c.getGreen(),255-c.getBlue());
				img2.setPixel(i, j, c2);				
			}
		}
		return img2;
	}

}
