<%@ WebService Language="C#" Class="PackWS" %>

using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Xml.Serialization;

[WebService(Namespace = "http://tempuri.org/")]
[WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
public class PackWS : System.Web.Services.WebService
{
    private Dictionary<int, Pack> dictionary;

    public PackWS()
    {
        dictionary = new Dictionary<int, Pack>();
    }

    [WebMethod]
    [XmlInclude(typeof(String))]
    public String getName()
    {
        return "Goodbye world!";
    }

    [WebMethod]
    [XmlInclude(typeof(Pack))]
    public void addPackage(Pack package)
    {
        dictionary.Add(package.getId(), package);
    }

    [WebMethod]
    [XmlInclude(typeof(Pack))]
    public Pack getPackage(int id)
    {
        return dictionary[id];
    }
}