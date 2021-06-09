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
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.ApparelProduct;
import de.hybris.training.core.jalo.ApparelSizeVariantProduct;
import de.hybris.training.core.jalo.ApparelStyleVariantProduct;
import de.hybris.training.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.training.core.jalo.SalesRepresentative;
import de.hybris.training.core.jalo.Service;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>TrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingCoreManager extends Extension
{
	/** Relation ordering override parameter constants for Product2Service from ((trainingcore))*/
	protected static String PRODUCT2SERVICE_SRC_ORDERED = "relation.Product2Service.source.ordered";
	protected static String PRODUCT2SERVICE_TGT_ORDERED = "relation.Product2Service.target.ordered";
	/** Relation disable markmodifed parameter constants for Product2Service from ((trainingcore))*/
	protected static String PRODUCT2SERVICE_MARKMODIFIED = "relation.Product2Service.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("brand", AttributeMode.INITIAL);
		tmp.put("weight", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("salesRepresentative", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.brand</code> attribute.
	 * @return the brand
	 */
	public String getBrand(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.BRAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.brand</code> attribute.
	 * @return the brand
	 */
	public String getBrand(final Product item)
	{
		return getBrand( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.brand</code> attribute. 
	 * @param value the brand
	 */
	public void setBrand(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.BRAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.brand</code> attribute. 
	 * @param value the brand
	 */
	public void setBrand(final Product item, final String value)
	{
		setBrand( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public SalesRepresentative createSalesRepresentative(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.SALESREPRESENTATIVE );
			return (SalesRepresentative)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SalesRepresentative : "+e.getMessage(), 0 );
		}
	}
	
	public SalesRepresentative createSalesRepresentative(final Map attributeValues)
	{
		return createSalesRepresentative( getSession().getSessionContext(), attributeValues );
	}
	
	public Service createService(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.SERVICE );
			return (Service)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Service : "+e.getMessage(), 0 );
		}
	}
	
	public Service createService(final Map attributeValues)
	{
		return createService( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.salesRepresentative</code> attribute.
	 * @return the salesRepresentative
	 */
	public SalesRepresentative getSalesRepresentative(final SessionContext ctx, final Customer item)
	{
		return (SalesRepresentative)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.SALESREPRESENTATIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.salesRepresentative</code> attribute.
	 * @return the salesRepresentative
	 */
	public SalesRepresentative getSalesRepresentative(final Customer item)
	{
		return getSalesRepresentative( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.salesRepresentative</code> attribute. 
	 * @param value the salesRepresentative
	 */
	public void setSalesRepresentative(final SessionContext ctx, final Customer item, final SalesRepresentative value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.SALESREPRESENTATIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.salesRepresentative</code> attribute. 
	 * @param value the salesRepresentative
	 */
	public void setSalesRepresentative(final Customer item, final SalesRepresentative value)
	{
		setSalesRepresentative( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.service</code> attribute.
	 * @return the service
	 */
	public Collection<Service> getService(final SessionContext ctx, final Product item)
	{
		final List<Service> items = item.getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.PRODUCT2SERVICE,
			"Service",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.service</code> attribute.
	 * @return the service
	 */
	public Collection<Service> getService(final Product item)
	{
		return getService( getSession().getSessionContext(), item );
	}
	
	public long getServiceCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.PRODUCT2SERVICE,
			"Service",
			null
		);
	}
	
	public long getServiceCount(final Product item)
	{
		return getServiceCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.service</code> attribute. 
	 * @param value the service
	 */
	public void setService(final SessionContext ctx, final Product item, final Collection<Service> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.PRODUCT2SERVICE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2SERVICE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.service</code> attribute. 
	 * @param value the service
	 */
	public void setService(final Product item, final Collection<Service> value)
	{
		setService( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to service. 
	 * @param value the item to add to service
	 */
	public void addToService(final SessionContext ctx, final Product item, final Service value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.PRODUCT2SERVICE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2SERVICE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to service. 
	 * @param value the item to add to service
	 */
	public void addToService(final Product item, final Service value)
	{
		addToService( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from service. 
	 * @param value the item to remove from service
	 */
	public void removeFromService(final SessionContext ctx, final Product item, final Service value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.PRODUCT2SERVICE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2SERVICE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from service. 
	 * @param value the item to remove from service
	 */
	public void removeFromService(final Product item, final Service value)
	{
		removeFromService( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.weight</code> attribute.
	 * @return the weight
	 */
	public Double getWeight(final SessionContext ctx, final Product item)
	{
		return (Double)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.WEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.weight</code> attribute.
	 * @return the weight
	 */
	public Double getWeight(final Product item)
	{
		return getWeight( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.weight</code> attribute. 
	 * @return the weight
	 */
	public double getWeightAsPrimitive(final SessionContext ctx, final Product item)
	{
		Double value = getWeight( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.weight</code> attribute. 
	 * @return the weight
	 */
	public double getWeightAsPrimitive(final Product item)
	{
		return getWeightAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final SessionContext ctx, final Product item, final Double value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.WEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final Product item, final Double value)
	{
		setWeight( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final SessionContext ctx, final Product item, final double value)
	{
		setWeight( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final Product item, final double value)
	{
		setWeight( getSession().getSessionContext(), item, value );
	}
	
}
