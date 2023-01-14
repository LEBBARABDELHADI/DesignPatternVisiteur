import java.util.ArrayList;
import java.util.List;

public class MainVisiteurModel {

	public static void main(String[] args) {
		List<HandleManager> listOfHandle= new ArrayList<>();
		listOfHandle.add(new ReceptionHandle());
		listOfHandle.add(new VerssementHandle());
		for (int i = 0; i < listOfHandle.size(); i++) {
			listOfHandle.get(i).handle();
		}
	}
}
