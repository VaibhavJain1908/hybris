/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 01-Jun-2021, 11:14:19 PM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.SalesRepresentative SalesRepresentative}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSalesRepresentative extends GenericItem
{
	/** Qualifier of the <code>SalesRepresentative.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>SalesRepresentative.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>SalesRepresentative.emailAddress</code> attribute **/
	public static final String EMAILADDRESS = "emailAddress";
	/** Qualifier of the <code>SalesRepresentative.customers</code> attribute **/
	public static final String CUSTOMERS = "customers";
	/**
	* {@link OneToManyHandler} for handling 1:n CUSTOMERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Customer> CUSTOMERSHANDLER = new OneToManyHandler<Customer>(
	CoreConstants.TC.CUSTOMER,
	false,
	"salesRepresentative",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(EMAILADDRESS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesRepresentative.customers</code> attribute.
	 * @return the customers
	 */
	public Collection<Customer> getCustomers(final SessionContext ctx)
	{
		return CUSTOMERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesRepresentative.customers</code> attribute.
	 * @return the customers
	 */
	public Collection<Customer> getCustomers()
	{
		return getCustomers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesRepresentative.customers</code> attribute. 
	 * @param value the customers
	 */
	public void setCustomers(final SessionContext ctx, final Collection<Customer> value)
	{
		CUSTOMERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesRepresentative.customers</code> attribute. 
	 * @param value the customers
	 */
	public void setCustomers(final Collection<Customer> value)
	{
		setCustomers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customers. 
	 * @param value the item to add to customers
	 */
	public void addToCustomers(final SessionContext ctx, final Customer value)
	{
		CUSTOMERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customers. 
	 * @param value the item to add to customers
	 */
	public void addToCustomers(final Customer value)
	{
		addToCustomers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customers. 
	 * @param value the item to remove from customers
	 */
	public void removeFromCustomers(final SessionContext ctx, final Customer value)
	{
		CUSTOMERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customers. 
	 * @param value the item to remove from customers
	 */
	public void removeFromCustomers(final Customer value)
	{
		removeFromCustomers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesRepresentative.emailAddress</code> attribute.
	 * @return the emailAddress
	 */
	public String getEmailAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesRepresentative.emailAddress</code> attribute.
	 * @return the emailAddress
	 */
	public String getEmailAddress()
	{
		return getEmailAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesRepresentative.emailAddress</code> attribute. 
	 * @param value the emailAddress
	 */
	public void setEmailAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesRepresentative.emailAddress</code> attribute. 
	 * @param value the emailAddress
	 */
	public void setEmailAddress(final String value)
	{
		setEmailAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesRepresentative.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesRepresentative.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesRepresentative.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesRepresentative.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesRepresentative.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesRepresentative.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesRepresentative.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesRepresentative.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
