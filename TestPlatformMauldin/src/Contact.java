
public class Contact {
	// Fields
		private String firstname;
		private String lastname;
		private String email;
		private String cellphone;
		private String address;
		
		//Constructor
		public Contact (String ln, String fn) {
			lastname = ln;
			firstname = fn;
		}
		
		//Methods
		public String getName() {
			return firstname + " " + lastname; 
		}
		
		public void setEmail(String em) {
			email = em;
		}
		
		public void setCellphone(String cp) {
			cellphone = cp;
		}
		
		public void  setAddress(String ad) {
			address = ad;
		}
		
}

