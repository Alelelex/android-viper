package cz.helmisek.android.androidrxvipersample.core.entity.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by Jirka Helmich on 11.10.16.
 */

public class Coord
{

	@SerializedName("lon")
	@Expose
	private Double lon;
	@SerializedName("lat")
	@Expose
	private Double lat;


	/**
	 * @return The lon
	 */
	public Double getLon()
	{
		return lon;
	}


	/**
	 * @param lon The lon
	 */
	public void setLon(Double lon)
	{
		this.lon = lon;
	}


	/**
	 * @return The lat
	 */
	public Double getLat()
	{
		return lat;
	}


	/**
	 * @param lat The lat
	 */
	public void setLat(Double lat)
	{
		this.lat = lat;
	}
}