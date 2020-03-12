package Model;

public class User {
	

		
			private String username;
			private String password;
			private String Cpassword;
			public User(String username, String password, String cpassword) {
		
				this.username = username;
				this.password = password;
				this.Cpassword = cpassword;
			}
			
			public User(String email, String password2) {
				this.username = username;
			this.password = password;
		}
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public String getCpassword() {
				return Cpassword;
			}
			public void setCpassword(String cpassword) {
				this.Cpassword = cpassword;
			}
			
			
			
		}




