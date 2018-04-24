
public class Taglio implements Trasformazione {
	//attributi
	private int i1,i2,j1,j2;
	
	//costruttore
	public Taglio(int i1,int j1,int i2, int j2){
	this.i1=i1;
	this.j1=j1;
	this.i2=i2;
	this.j2=j2;
	}

	@Override
	public Immagine trasforma(Immagine img) {
		Immagine img2 = new Immagine(img.larghezza(),img.altezza());
		
		
		for(int i=this.i1;i<this.i2;i++){
			for(int j=this.j1;j<this.j2;j++){
				Colore c= img.getPixel(i, j);
				img2.setPixel(i, j, c);
			}
		}
		return img2;
	}

}
