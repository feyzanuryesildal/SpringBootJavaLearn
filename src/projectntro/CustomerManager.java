package projectntro;

public class CustomerManager implements ICustomerService{
	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		CustomerDal customerDal = new CustomerDal();
		customerDal.add();
	}
	

}
