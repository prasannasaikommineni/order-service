package com.kps.order.model;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetails1 implements UserDetails {
String username;
String password;
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
@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean isAccountNonExpired() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean isCredentialsNonExpired() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean isEnabled() {
	// TODO Auto-generated method stub
	return false;
}
}
