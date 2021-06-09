/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 01-Jun-2021, 11:14:19 PM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.Service Service}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedService extends GenericItem
{
	/** Qualifier of the <code>Service.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Service.serviceType</code> attribute **/
	public static final String SERVICETYPE = "serviceType";
	/** Qualifier of the <code>Service.years</code> attribute **/
	public static final String YEARS = "years";
	/** Qualifier of the <code>Service.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Relation ordering override parameter constants for Product2Service from ((trainingcore))*/
	protected static String PRODUCT2SERVICE_SRC_ORDERED = "relation.Product2Service.source.ordered";
	protected static String PRODUCT2SERVICE_TGT_ORDERED = "relation.Product2Service.target.ordered";
	/** Relation disable markmodifed parameter constants for Product2Service from ((trainingcore))*/
	protected static String PRODUCT2SERVICE_MARKMODIFIED = "relation.Product2Service.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(SERVICETYPE, AttributeMode.INITIAL);
		tmp.put(YEARS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Service.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Service.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Service.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Service.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Product");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(PRODUCT2SERVICE_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Service.product</code> attribute.
	 * @return the product
	 */
	public Collection<Product> getProduct(final SessionContext ctx)
	{
		final List<Product> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.PRODUCT2SERVICE,
			"Product",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Service.product</code> attribute.
	 * @return the product
	 */
	public Collection<Product> getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	public long getProductCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.PRODUCT2SERVICE,
			"Product",
			null
		);
	}
	
	public long getProductCount()
	{
		return getProductCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Service.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Collection<Product> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.PRODUCT2SERVICE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2SERVICE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Service.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Collection<Product> value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to product. 
	 * @param value the item to add to product
	 */
	public void addToProduct(final SessionContext ctx, final Product value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.PRODUCT2SERVICE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2SERVICE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to product. 
	 * @param value the item to add to product
	 */
	public void addToProduct(final Product value)
	{
		addToProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from product. 
	 * @param value the item to remove from product
	 */
	public void removeFromProduct(final SessionContext ctx, final Product value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.PRODUCT2SERVICE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2SERVICE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from product. 
	 * @param value the item to remove from product
	 */
	public void removeFromProduct(final Product value)
	{
		removeFromProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Service.serviceType</code> attribute.
	 * @return the serviceType
	 */
	public EnumerationValue getServiceType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SERVICETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Service.serviceType</code> attribute.
	 * @return the serviceType
	 */
	public EnumerationValue getServiceType()
	{
		return getServiceType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Service.serviceType</code> attribute. 
	 * @param value the serviceType
	 */
	public void setServiceType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SERVICETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Service.serviceType</code> attribute. 
	 * @param value the serviceType
	 */
	public void setServiceType(final EnumerationValue value)
	{
		setServiceType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Service.years</code> attribute.
	 * @return the years
	 */
	public Integer getYears(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, YEARS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Service.years</code> attribute.
	 * @return the years
	 */
	public Integer getYears()
	{
		return getYears( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Service.years</code> attribute. 
	 * @return the years
	 */
	public int getYearsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getYears( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Service.years</code> attribute. 
	 * @return the years
	 */
	public int getYearsAsPrimitive()
	{
		return getYearsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Service.years</code> attribute. 
	 * @param value the years
	 */
	public void setYears(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, YEARS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Service.years</code> attribute. 
	 * @param value the years
	 */
	public void setYears(final Integer value)
	{
		setYears( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Service.years</code> attribute. 
	 * @param value the years
	 */
	public void setYears(final SessionContext ctx, final int value)
	{
		setYears( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Service.years</code> attribute. 
	 * @param value the years
	 */
	public void setYears(final int value)
	{
		setYears( getSession().getSessionContext(), value );
	}
	
}
