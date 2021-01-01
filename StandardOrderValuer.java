
public class StandardOrderValuer implements OrderValuer {
	public int valueAs(int qtyCat1, int qtyCat2, int qtyCat3, int pCat1, int pCat2, int pCat3) {
		return qtyCat1*pCat1+qtyCat2*pCat2+qtyCat3*pCat3;
	}
}

