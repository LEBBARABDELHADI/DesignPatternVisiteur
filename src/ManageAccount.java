import java.util.ArrayList;
import java.util.List;

public class ManageAccount implements ManageAccountInt {

	List<HandleManager> listOfHandle = new ArrayList<HandleManager>();

	public void addHandleChild(HandleManager child) {
		listOfHandle.add(child);
	}
	public void accept( VerssementHandle p) {
		p.handle();
	};
	 public void accept( ContextHandle p) {
		p.handle();
	};
	public void accept( ReceptionHandle p){
		p.handle();
	};
	
	public List<HandleManager> getListOfHandle() {
		return listOfHandle;
	}

	public void setListOfHandle(List<HandleManager> listOfHandle) {
		this.listOfHandle = listOfHandle;
	}
	
}
