
public class store {
	/*
	import java.sql.*;
	import java.util.*;
	public class guin {
		Connection con = null;
		Statement stmt = null;
		String url = "jdbc:mysql://localhost/guindata?serverTimezone=Asia/Seoul";
		String user = "root";
		String passwd = "0428";
		public static void main(String[] args) {
			guin db = new guin();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				db.con = DriverManager.getConnection(db.url, db.user, db.passwd);
				db.stmt = db.con.createStatement();

				System.out.println("[1] ���̺� ����");
				System.out.println("[2] ������ �߰�");
				System.out.println("[3] ������ ����");
				System.out.println("[4] ������ ����");
				System.out.println("[5] ������ ��ȸ");
				
				System.out.print("= ��ȣ �Է� : ");
				Scanner s = new Scanner(System.in);
				int num = s.nextInt();
				
				switch(num) {
					case 1 :
						//db.createTable();	//���̺� ����
						break;
					case 2 :
						db.insertData();	//������ ����
						break;
					case 3 :
						db.removeData();	//������ ����
						break;
					case 4 :
						//db.changeData();	//������ ����
						break;
					case 5 :
						db.viewData();		//������ ��ȸ
						break;
				}
			} catch(Exception e) {
				System.out.println(e.toString());
			} finally {
				try {
					db.stmt.close();
					db.con.close();				
				} catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		}

		
		void createTable() {
			try {
				String createStr = "CREATE TABLE user (id varchar(20) not null, password varchar(20) not null,"
								 + " name varchar(10) not null,  address varchar(20) not null, phone int(11) not null, "
						         + " email varchar(30) not null, occupation varchar(20) null, PRIMARY KEY (id))";
				stmt.execute(createStr);
				System.out.println("���̺� ���� ����!");
			} catch(Exception e) {
				System.out.println("���̺� ���� ���� ���� : " + e.toString());
			}
		}

		//����
		void insertData() {
			try {
				String id;
				String password;
				String name;
				String address;
				int phone;
				String email;
				String occupation;
				Scanner s = new Scanner(System.in);
				System.out.print("Enter the id: ");
				id = s.nextLine();
				System.out.print("Enter the password: ");
				password = s.nextLine();
				System.out.print("Enter the name: ");
				name = s.nextLine();
				System.out.print("Enter the address: ");
				address = s.nextLine();
				System.out.print("Enter the phone: ");
				phone = s.nextInt();
				s.nextLine();
				System.out.print("Enter the email: ");
				email = s.nextLine();
				System.out.print("Enter the occupation: ");
				occupation = s.nextLine();
				String insertStr = "INSERT INTO user VALUES('"+id+"', '"+password+"', '"+name+"', '"+address+"', '"+phone+"', '"+email+"', '"+occupation+"')";
				stmt.executeUpdate(insertStr);
				System.out.println("������ �߰� ����!");
			} catch(Exception e) {
				System.out.println("������ �߰� ���� ���� : " + e.toString());
			}
		}

		//����
		void removeData() {
			try {
				String id;
				Scanner s = new Scanner(System.in);
				System.out.print("Enter the id to delete: ");
				id = s.nextLine();
				String removeStr = "DELETE FROM user where id='"+id+"'";
				stmt.executeUpdate(removeStr);
				System.out.println("������ ���� ����!");
			} catch(Exception e) {
				System.out.println("������ ���� ���� ���� : " + e.toString());
			}
		}

		
		void changeData() {
			try {
				String changeStr = "UPDATE user SET name='������'";
				stmt.executeUpdate(changeStr);
				System.out.println("������ ���� ����!");
			} catch(Exception e) {
				System.out.println("������ ���� ���� ���� : " + e.toString());
			}
		}

		//��ȸ
		void viewData() {
			try {
				System.out.println("== user ���̺� ��ȸ ==");
				String viewStr1 = "SELECT * FROM user";
				ResultSet result1 = stmt.executeQuery(viewStr1);
				int cnt1 = 0;
				while(result1.next()) {
					System.out.print(result1.getString("id") + "\t" + result1.getString("name")
									 + "\t" + result1.getString("address") + "\t" + result1.getInt("phone")
									 + "\t" + result1.getString("email")+ "\t" + result1.getString("occupation")+ "\n");
					cnt1++;
				}
				
				System.out.println("");
				System.out.println("== students ���̺� ��ȸ ==");
				String viewStr2 = "SELECT * FROM user";
				ResultSet result2 = stmt.executeQuery(viewStr2);
				int cnt2 = 0;
				while(result2.next()) {
					System.out.print(result1.getString("id") + "\t" + result1.getString("name")
					 + "\t" + result1.getString("address") + "\t" + result1.getInt("phone")
					 + "\t" + result1.getString("email")+ "\t" + result1.getString("occupation")+ "\n");
					cnt2++;
				}
				
				System.out.println("");
				System.out.println("������ ��ȸ ����!");
			} catch(Exception e) {
				System.out.println("������ ��ȸ ���� ���� : " + e.toString());
			}
		}
	}
*/
}
