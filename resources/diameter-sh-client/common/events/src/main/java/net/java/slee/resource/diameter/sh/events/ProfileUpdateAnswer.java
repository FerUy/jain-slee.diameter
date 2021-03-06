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

package net.java.slee.resource.diameter.sh.events;

import net.java.slee.resource.diameter.base.events.avp.ExperimentalResultAvp;
import net.java.slee.resource.diameter.base.events.avp.FailedAvp;

/**
 * Defines an interface representing the Profile-Update-Answer command.
 * 
 * From the Diameter Sh Reference Point Protocol Details (3GPP TS 29.329 V9.2.0)
 * specification:
 * 
 * <pre>
 * 6.1.4        Profile-Update-Answer (PUA) Command
 * 
 * The Profile-Update-Answer (PUA) command, indicated by the Command-Code field
 * set to 307 and the 'R' bit cleared in the Command Flags field, is sent by a
 * server in response to the Profile-Update-Request command. The
 * Experimental-Result AVP may contain one of the values defined in section 6.2 or
 * in 3GPP TS 29.229 [6].
 * 
 * Message Format
 * &lt; Profile-Update-Answer &gt; ::=   &lt; Diameter Header: 307, PXY, 16777217 &gt;
 *                                 &lt; Session-Id &gt;
 *                                 { Vendor-Specific-Application-Id }
 *                                 [ Result-Code ]
 *                                 [ Experimental-Result ]
 *                                 { Auth-Session-State }
 *                                 { Origin-Host }
 *                                 { Origin-Realm }
 *                                 [ Wildcarded-Public-Identity ]
 *                                 [ Wildcarded-IMPU ]
 *                                 *[ Supported-Features ]
 *                                 *[ AVP ]
 *                                 *[ Failed-AVP ]
 *                                 *[ Proxy-Info ]
 *                                 *[ Route-Record ]
 * </pre>
 * 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public interface ProfileUpdateAnswer extends DiameterShMessage {

  static final int commandCode = 307;

  /**
   * Returns true if the Result-Code AVP is present in the message.
   */
  boolean hasResultCode();

  /**
   * Returns the value of the Result-Code AVP, of type Unsigned32. Use
   * {@link #hasResultCode()} to check the existence of this AVP.
   * 
   * @return the value of the Result-Code AVP
   * @throws IllegalStateException
   *             if the Result-Code AVP has not been set on this message
   */
  long getResultCode();

  /**
   * Sets the value of the Result-Code AVP, of type Unsigned32.
   * 
   * @throws IllegalStateException
   *             if setResultCode has already been called
   */
  void setResultCode(long resultCode);

  /**
   * Returns true if the Experimental-Result AVP is present in the message.
   */
  boolean hasExperimentalResult();

  /**
   * Returns the value of the Experimental-Result AVP, of type Grouped.
   * 
   * @return the value of the Experimental-Result AVP or null if it has not
   *         been set on this message
   */
  ExperimentalResultAvp getExperimentalResult();

  /**
   * Sets the value of the Experimental-Result AVP, of type Grouped.
   * 
   * @throws IllegalStateException
   *             if setExperimentalResult has already been called
   */
  void setExperimentalResult(ExperimentalResultAvp experimentalResult);

  /**
   * Returns the set of Failed-AVP AVPs. The returned array contains the AVPs
   * in the order they appear in the message. A return value of null implies
   * that no Failed-AVP AVPs have been set. The elements in the given array
   * are FailedAvp objects.
   */
  FailedAvp[] getFailedAvps();

  /**
   * Sets a single Failed-AVP AVP in the message, of type Grouped.
   * 
   * @throws IllegalStateException
   *             if setFailedAvp or setFailedAvps has already been called
   */
  void setFailedAvp(FailedAvp failedAvp);

  /**
   * Sets the set of Failed-AVP AVPs, with all the values in the given array.
   * The AVPs will be added to message in the order in which they appear in
   * the array.
   * 
   * Note: the array must not be altered by the caller following this call,
   * and getFailedAvps() is not guaranteed to return the same array instance,
   * e.g. an "==" check would fail.
   * 
   * @throws IllegalStateException
   *             if setFailedAvp or setFailedAvps has already been called
   */
  void setFailedAvps(FailedAvp[] failedAvps);

  /**
   * Returns true if the Wildcarded-Public-Identity AVP is present in the message.
   */
  boolean hasWildcardedPublicIdentity();

  /**
   * Returns the value of the Wildcarded-Public-Identity AVP, of type UTF8String. Use
   * {@link #hasWildcardedPublicIdentity()} to check the existence of this AVP.
   * 
   * @return the value of the Wildcarded-Public-Identity AVP
   * @throws IllegalStateException
   *             if the Wildcarded-Public-Identity AVP has not been set on this message
   */
  String getWildcardedPublicIdentity();

  /**
   * Sets the value of the Wildcarded-Public-Identity AVP, of type UTF8String.
   * 
   * @throws IllegalStateException
   *             if setWildcardedPublicIdentity has already been called
   */
  void setWildcardedPublicIdentity(String wildcardedPublicIdentity); 
  
  /**
   * Returns true if the Wildcarded-IMPU AVP is present in the message.
   */
  boolean hasWildcardedIMPU();

  /**
   * Returns the value of the Wildcarded-IMPU AVP, of type UTF8String. Use
   * {@link #hasWildcardedIMPU()} to check the existence of this AVP.
   * 
   * @return the value of the Wildcarded-IMPU AVP
   * @throws IllegalStateException
   *             if the Wildcarded-IMPU AVP has not been set on this message
   */
  String getWildcardedIMPU();

  /**
   * Sets the value of the Wildcarded-IMPU AVP, of type UTF8String.
   * 
   * @throws IllegalStateException
   *             if setWildcardedIMPU has already been called
   */
  void setWildcardedIMPU(String WildcardedIMPU);
}
