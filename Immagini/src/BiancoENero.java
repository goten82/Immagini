
public class BiancoENero implements Trasformazione {

	@Override
	public Immagine trasforma(Immagine img) {
		Immagine img2= new Immagine(img.larghezza(),img.altezza());
		for(int i=0;i<img.altezza();i++) {
			for(int j=0;j<img.larghezza();j++) {
				Colore c1=img.getPixel(i, j);
				double l1=0.2126*c1.getRed()+0.7152*c1.getGreen()+0.0722*c1.getBlue();
				int l= (int)l1;
				Colore c2=new Colore(l,l,l);
				img2.setPixel(i, j, c2);
			}
		}
		
		return img2;
	}

}
