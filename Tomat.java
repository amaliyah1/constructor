public class Tomat extends Sayuran{

	public int nilai;

	public Tomat(String nama, int nilai){
		super(nama);		
		this.nilai = nilai;
	}

	public Tomat(String nama){
		super(nama);
	}

	public void showNilai(){
		System.out.println(nilai);
	}
}