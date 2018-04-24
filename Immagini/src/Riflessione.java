
public class Riflessione implements Trasformazione {
	//attributo
	private boolean orizzontale;
	
	//costruttore
	public Riflessione(boolean orizzontale) {
		this.orizzontale=orizzontale;
	}

	@Override
	public Immagine trasforma(Immagine img) {
		Immagine img1= new Immagine(img.larghezza(),img.altezza());
		for(int i=0;i<img.altezza();i++) {
			for(int j=0;j<img.larghezza();j++) {
				if(orizzontale) {					
					Colore c1= img.getPixel(i, j);
					img1.setPixel(i, img.larghezza()-j-1, c1);
				}	
				else {
					Colore c1= img.getPixel(i, j);
					img1.setPixel(img.altezza()-i-1, j, c1);
				}				
			}
		}		
			
			
		return img1;
	}

}
