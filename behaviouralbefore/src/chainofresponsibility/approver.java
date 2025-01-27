package chainofresponsibility;

public abstract class approver {
	
	approver a1;
	
	void setNextApprover(approver a1) {
		this.a1=a1;
	}
	
	public void approval(purchasreq req)
	{
		if(canapprove(req.getAmount()))
		{
			approve();
		}
		else if(a1!=null){
			a1.approval(req);
		}
		else {
		  System.out.println("not found");
		}
	}
	
	public abstract boolean canapprove(double amount);
	public abstract void approve();

}
