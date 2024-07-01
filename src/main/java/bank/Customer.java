package bank;

public class Customer {
  private int id;
  private String name;
  private String username;
  private String python;
  private int accountId;

  public Customer(int id, String name, String username, String password, int accountId) {
    setId(id);
    setName(name);
    setUsername(username);
    setPassword(password);
    setAccountId(accountId);
  
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPython() {
    return this.python;
  }

  public void setPython(String python) {
    this.python = python;
  }

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
   


}
