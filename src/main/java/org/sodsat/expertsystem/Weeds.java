package org.sodsat.expertsystem;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Weeds implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Description("Weed species we are checking if we have to launch an alarm")
   @org.kie.api.definition.type.Label("Weed Species")
   private java.lang.String weedSpecies;
   @org.kie.api.definition.type.Description("Depends on the weed species and is used to compute the GDD")
   @org.kie.api.definition.type.Label("Basal temperature")
   private java.lang.Double basalTemp;
   @org.kie.api.definition.type.Description("Retrieved from the weather station")
   @org.kie.api.definition.type.Label("Air average temperature")
   private Double airAvgTemp;
   @org.kie.api.definition.type.Description("Retrieved from the underground sensor")
   @org.kie.api.definition.type.Label("Soil average temperature")
   private java.lang.Double soilAvgTemp;
   @org.kie.api.definition.type.Description("Variable to accumulate the growing degree days for a weed type")
   @org.kie.api.definition.type.Label("Growing Degree Days")
   private java.lang.Double gdd;

   @org.kie.api.definition.type.Label("Daily soil temperature readings")
   private java.util.List<org.sodsat.expertsystem.DailyReadings> dailySoilTemperature;

   @org.kie.api.definition.type.Description("List of daily readings with the air temperature values")
   @org.kie.api.definition.type.Label("Daily air temperature readings")
   private java.util.List<org.sodsat.expertsystem.DailyReadings> dailyAirTemperature;

   @org.kie.api.definition.type.Label("Weed Notification")
   private java.lang.String weedAlarm;

   public Weeds()
   {
   }

   public java.lang.String getWeedSpecies()
   {
      return this.weedSpecies;
   }

   public void setWeedSpecies(java.lang.String weedSpecies)
   {
      this.weedSpecies = weedSpecies;
   }

   public java.lang.Double getBasalTemp()
   {
      return this.basalTemp;
   }

   public void setBasalTemp(java.lang.Double basalTemp)
   {
      this.basalTemp = basalTemp;
   }

   public java.lang.Double getSoilAvgTemp()
   {
      return this.soilAvgTemp;
   }

   public void setSoilAvgTemp(java.lang.Double soilAvgTemp)
   {
      this.soilAvgTemp = soilAvgTemp;
   }

   public java.lang.Double getGdd()
   {
      return this.gdd;
   }

   public void setGdd(java.lang.Double gdd)
   {
      this.gdd = gdd;
   }

   public java.util.List<org.sodsat.expertsystem.DailyReadings> getDailySoilTemperature()
   {
      return this.dailySoilTemperature;
   }

   public void setDailySoilTemperature(
         java.util.List<org.sodsat.expertsystem.DailyReadings> dailySoilTemperature)
   {
      this.dailySoilTemperature = dailySoilTemperature;
   }

   public java.util.List<org.sodsat.expertsystem.DailyReadings> getDailyAirTemperature()
   {
      return this.dailyAirTemperature;
   }

   public void setDailyAirTemperature(
         java.util.List<org.sodsat.expertsystem.DailyReadings> dailyAirTemperature)
   {
      this.dailyAirTemperature = dailyAirTemperature;
   }

   public java.lang.String getWeedAlarm()
   {
      return this.weedAlarm;
   }

   public void setWeedAlarm(java.lang.String weedAlarm)
   {
      this.weedAlarm = weedAlarm;
   }

   public java.lang.Double getAirAvgTemp()
   {
      return this.airAvgTemp;
   }

   public void setAirAvgTemp(java.lang.Double airAvgTemp)
   {
      this.airAvgTemp = airAvgTemp;
   }

   public Weeds(
         java.lang.String weedSpecies,
         java.lang.Double basalTemp,
         java.lang.Double airAvgTemp,
         java.lang.Double soilAvgTemp,
         java.lang.Double gdd,
         java.util.List<org.sodsat.expertsystem.DailyReadings> dailySoilTemperature,
         java.util.List<org.sodsat.expertsystem.DailyReadings> dailyAirTemperature,
         java.lang.String weedAlarm)
   {
      this.weedSpecies = weedSpecies;
      this.basalTemp = basalTemp;
      this.airAvgTemp = airAvgTemp;
      this.soilAvgTemp = soilAvgTemp;
      this.gdd = gdd;
      this.dailySoilTemperature = dailySoilTemperature;
      this.dailyAirTemperature = dailyAirTemperature;
      this.weedAlarm = weedAlarm;
   }
   
   /*Method to initialise the list of daily soil temperatures*/
   public void initSoilTemps()
   {
      // Array to store the daily soil temperature values.
      this.dailySoilTemperature = new java.util.ArrayList<org.sodsat.expertsystem.DailyReadings>();

      // DailyReadings object with the sample soil temperature readings that we will copy.
      org.sodsat.expertsystem.DailyReadings dr = new org.sodsat.expertsystem.DailyReadings();
      dr.initDailySoilTempReadings();

      // And now, we fill in the array of daily readings.
      this.dailySoilTemperature.add(dr); // Soil temperature day 1 (pos 0)
      this.dailySoilTemperature.add(dr); // Soil temperature day 2 (pos 1)
      this.dailySoilTemperature.add(dr); // Soil temperature day 3 (pos 2)
      this.dailySoilTemperature.add(dr); // Soil temperature day 4 (pos 3)
   }

   /*Method to initialise the list of daily air temperatures*/
   public void initAirTemps()
   {
      // Array to store the daily air temperature values.
      this.dailyAirTemperature = new java.util.ArrayList<org.sodsat.expertsystem.DailyReadings>();

      // DailyReadings object with the sample air temperature readings that we will copy.
      org.sodsat.expertsystem.DailyReadings dr = new org.sodsat.expertsystem.DailyReadings();
      dr.initDailyAirTempReadings();

      // And now, we fill in the array of daily readings.
      this.dailyAirTemperature.add(dr); // Air temperature day 1 (pos 0)
      this.dailyAirTemperature.add(dr); // Air temperature day 2 (pos 1)
      this.dailyAirTemperature.add(dr); // Air temperature day 3 (pos 2)
      this.dailyAirTemperature.add(dr); // Air temperature day 4 (pos 3)
   }
}