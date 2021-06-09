/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 01-Jun-2021, 11:14:19 PM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated(since = "ages", forRemoval = false)
@SuppressWarnings({"unused","cast"})
public class GeneratedTrainingCoreConstants
{
	public static final String EXTENSIONNAME = "trainingcore";
	public static class TC
	{
		public static final String APPARELPRODUCT = "ApparelProduct".intern();
		public static final String APPARELSIZEVARIANTPRODUCT = "ApparelSizeVariantProduct".intern();
		public static final String APPARELSTYLEVARIANTPRODUCT = "ApparelStyleVariantProduct".intern();
		public static final String ELECTRONICSCOLORVARIANTPRODUCT = "ElectronicsColorVariantProduct".intern();
		public static final String SALESREPRESENTATIVE = "SalesRepresentative".intern();
		public static final String SERVICE = "Service".intern();
		public static final String SERVICETYPE = "ServiceType".intern();
		public static final String SRTYPE = "SRType".intern();
		public static final String SWATCHCOLORENUM = "SwatchColorEnum".intern();
	}
	public static class Attributes
	{
		public static class Customer
		{
			public static final String SALESREPRESENTATIVE = "salesRepresentative".intern();
		}
		public static class Product
		{
			public static final String BRAND = "brand".intern();
			public static final String SERVICE = "service".intern();
			public static final String WEIGHT = "weight".intern();
		}
	}
	public static class Enumerations
	{
		public static class ServiceType
		{
			public static final String BASIC = "BASIC".intern();
			public static final String BASICONSITE = "BASICONSITE".intern();
			public static final String ADVANCED = "ADVANCED".intern();
		}
		public static class SRType
		{
			public static final String CHECK = "CHECK".intern();
			public static final String COMMISSIONED = "COMMISSIONED".intern();
			public static final String SALARIED = "SALARIED".intern();
			public static final String NONPROFIT = "NONPROFIT".intern();
		}
		public static class SwatchColorEnum
		{
			public static final String BLACK = "BLACK".intern();
			public static final String BLUE = "BLUE".intern();
			public static final String BROWN = "BROWN".intern();
			public static final String GREEN = "GREEN".intern();
			public static final String GREY = "GREY".intern();
			public static final String ORANGE = "ORANGE".intern();
			public static final String PINK = "PINK".intern();
			public static final String PURPLE = "PURPLE".intern();
			public static final String RED = "RED".intern();
			public static final String SILVER = "SILVER".intern();
			public static final String WHITE = "WHITE".intern();
			public static final String YELLOW = "YELLOW".intern();
		}
	}
	public static class Relations
	{
		public static final String PRODUCT2SERVICE = "Product2Service".intern();
		public static final String SALESREPRESENTATIVE2CUSTOMERS = "SalesRepresentative2Customers".intern();
	}
	
	protected GeneratedTrainingCoreConstants()
	{
		// private constructor
	}
	
	
}
