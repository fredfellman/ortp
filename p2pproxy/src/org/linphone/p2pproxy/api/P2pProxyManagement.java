/*
p2pproxy
Copyright (C) 2007  Jehan Monnier ()

P2pProxyManagement.java - .

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/
package org.linphone.p2pproxy.api;


public interface P2pProxyManagement extends P2pProxyNetworkProbe,P2pProxySipProxyRegistrarManagement {

   /**
    * test if according both to local peer capabilities and supeer peer election polity this peer should become a super peer
    * 
    * @return
    */  
   public boolean shouldIBehaveAsAnRdv() throws P2pProxyException;

}
