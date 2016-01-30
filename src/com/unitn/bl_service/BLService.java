package com.unitn.bl_service;

import com.unitn.local_database.UserData;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by erinda on 1/24/16.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public interface BLService {

    @WebMethod
    @WebResult
    String getDescription();

    @WebMethod
    @WebResult
    boolean registerNewUser(UserData user);
}
