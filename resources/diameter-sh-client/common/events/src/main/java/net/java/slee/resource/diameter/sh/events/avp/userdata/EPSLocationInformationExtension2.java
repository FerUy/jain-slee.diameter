/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package net.java.slee.resource.diameter.sh.events.avp.userdata;

import org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TExtension;
import org.w3c.dom.Element;

import java.util.List;

/**
 * <p>Interface for tEPSLocationInformation-Extension2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 *  <xs:complexType name="tEPSLocationInformation-Extension2">
 * 		<xs:sequence>
 * 			<xs:element name="RATtype" type="tRATtype" minOccurs="0"/>
 * 			<xs:element name="Extension" type="tExtension" minOccurs="0"/>
 * 		</xs:sequence>
 * 	</xs:complexType>
 * </pre>
 *
 * @author <a href="mailto:fernando.mendioroz@gmail.com"> Fernando Mendioroz </a>
 */
public interface EPSLocationInformationExtension2 {

    /**
     * Gets the value of the ratType property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public abstract Integer getRATtype();

    /**
     * Sets the value of the ratType property.
     *
     * @param ratType
     *     allowed object is
     *     {@link Integer }
     *
     */
    public abstract void setRATtype(Integer ratType);

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link TExtension }
     *
     */
    public abstract Extension getExtension();

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link TExtension }
     *
     */
    public abstract void setExtension(Extension value);

}
