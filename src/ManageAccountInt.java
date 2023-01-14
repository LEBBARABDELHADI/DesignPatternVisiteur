import java.util.List;

public interface ManageAccountInt {

	void addHandleChild(HandleManager child);

	void accept(VerssementHandle p);

	void accept(ContextHandle p);

	void accept(ReceptionHandle p);

	public List<HandleManager> getListOfHandle();

	public void setListOfHandle(List<HandleManager> listOfHandle);

}
