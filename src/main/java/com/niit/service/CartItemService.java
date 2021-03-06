package com.niit.service;

import com.niit.model.Cart;
import com.niit.model.CartItem;

public interface CartItemService {

	
	public void addCartItem(CartItem cartItem);
	
	public void removeCartItem(int cartItemId);
	
	public void  removeAllCartItems(int cartId);
	
	public Cart getCart(int cartId);	
}
