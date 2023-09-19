package program;

interface Permission{
	//marker interface meaning there is no method preset in	
	}
	class inter implements Permission{
		public void show() {
			System.out.println("show() method implements");
		}
	}
	public class Marker_interface {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			inter obj = new inter();
			
			//by using instanceof object call
			if(obj instanceof Permission)
				obj.show();
			else
				System.out.println("no method implements"); 
			
			
			//by object call
//			obj.show();
				
		}

	}
