package com.bitmonlab.osiris.api.map.rest.api;

import javax.ws.rs.core.Response;

import com.bitmonlab.osiris.api.core.map.exceptions.QueryException;
import com.bitmonlab.osiris.api.core.map.exceptions.RoomNotFoundException;
import com.bitmonlab.osiris.api.core.map.transferobject.LayerDTO;
import com.bitmonlab.osiris.core.assembler.AssemblyException;

public interface SearchResource {
	
	Response getFeaturesByQuery(String appIdentifier, String query, LayerDTO layer, Integer pageIndex,Integer pageSize, String orderField, String order) throws AssemblyException, QueryException;

	Response getRoomByLocation(String appIdentifier, Double longitude, Double latitude, Integer floor)
			throws AssemblyException, RoomNotFoundException;

	
}
