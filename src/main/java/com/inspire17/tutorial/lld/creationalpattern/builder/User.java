package com.inspire17.tutorial.lld.creationalpattern.builder;

public class User {
  private final String id;
  private final String firstName;
  private final String secondName;
  private final String address;

  private User(Builder builder) {
    id = builder.id;
    firstName = builder.firstName;
    secondName = builder.secondName;
    address = builder.address;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public String getAddress() {
    return address;
  }

  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    return "User{"
        + "id='"
        + id
        + '\''
        + ", firstName='"
        + firstName
        + '\''
        + ", secondName='"
        + secondName
        + '\''
        + ", address='"
        + address
        + '\''
        + '}';
  }

  public static class Builder {

    public String id;
    public String firstName;
    public String secondName;
    public String address;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder firstName(String fname) {
      firstName = fname;
      return this;
    }

    public Builder secondName(String sname) {
      secondName = sname;
      return this;
    }

    public Builder address(String add) {
      address = add;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }
}
