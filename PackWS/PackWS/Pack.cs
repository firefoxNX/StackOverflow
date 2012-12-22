using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Xml.Serialization;

[XmlRoot]
public class Pack
{
    private int id;
    private string name;

    public Pack()
    {
    }

    public Pack(int anId, string aName)
    {
        this.id = anId;
        this.name = aName;
    }

    public void setId(int anId)
    {
        this.id = anId;
    }

    public int getId()
    {
        return id;
    }

    public void setName(string aName)
    {
        this.name = aName;
    }

    public string getName()
    {
        return name;
    }
}