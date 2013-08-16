package org.osmdroid.tileprovider.tilesource;

import org.osmdroid.ResourceProxy.string;
import org.osmdroid.tileprovider.MapTile;


public class TiandituTileSource extends OnlineTileSourceBase {

	private String mLayerName = "";
	
	public TiandituTileSource(final String aName, final string aResourceId, final int aZoomMinLevel,
			final int aZoomMaxLevel, final int aTileSizePixels, final String aImageFilenameEnding,
			final String aLayerName,
			final String... aBaseUrl) {
		super(aName, aResourceId, aZoomMinLevel, aZoomMaxLevel, aTileSizePixels,
				aImageFilenameEnding, aBaseUrl);
		mLayerName = aLayerName;
	}
	
	@Override
	public String getTileURLString(MapTile aTile) {
	
		return getBaseUrl() + "?SERVICE=WMTS&REQUEST=GetTile&VERSION=1.0.0&LAYER="+ mLayerName +"&STYLE=default&TILEMATRIXSET=c&TILEMATRIX=" + aTile.getZoomLevel() + "&TILEROW=" + aTile.getY() + "&TILECOL=" + aTile.getX() + "&FORMAT=tiles";
	}
}