package mypojo;

public class Login {
private String login;
private String pass;

public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String display() {
	return "Value of login and password"+login+":"+pass;
}
}
