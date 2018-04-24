
public class CambioColore implements Trasformazione {
	//Attributi
	public Colore c1;//colore da sostituire
	public Colore c2;//colore sostituto
	
	//Costruttore
	public void Cambia(Colore c1, Colore c2) {
		this.c1=c1;
		this.c2=c2;
	}

	@Override
	public Immagine trasforma(Immagine img) {
		Immagine img1= new Immagine(img.larghezza(),img.altezza());
		//Immagine img2;
		for(int i=0;i<img.altezza();i++) {
			for(int j=0;j<img.larghezza();j++) {
				if(img.equals(this.c1)) {
					c2=c1;
				}
				img1.setPixel(i, j, c2);
			}
		}
		
		return img1;
	}

}
