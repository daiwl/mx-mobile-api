package com.magenta.maxoptra.mobile.api.ns.mns1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FieldType")
@XmlEnum
public enum FieldType {
    STRING,
    NUMBER,
    TEXT
}
