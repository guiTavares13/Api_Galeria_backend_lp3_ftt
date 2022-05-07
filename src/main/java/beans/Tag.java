package beans;

public class Tag {
	
	private int id;
	private String tag;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setId(String id) {
		if (id == null) {
			setId(0);
		} else {
		 setId(Integer.valueOf(id));
		}
	}
	
	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
}
