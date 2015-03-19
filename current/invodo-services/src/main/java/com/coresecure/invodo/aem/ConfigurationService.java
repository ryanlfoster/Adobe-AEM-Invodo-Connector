/*
    Adobe CQ5 Invodo Connector

    Copyright (C) 2015 Coresecure Inc.

        Authors:    Alessandro Bonfatti

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package com.coresecure.invodo.aem;

import java.util.List;

public interface ConfigurationService {
    public String getAffiliateId();
    public String getApiKey();
    public String getStoragePath();
    public String getCRON();
    public Boolean isCronActive();
    public Boolean isAdminRefreshAllowed();
    public String[] getRefresherGroups();
    public List<String> getRefresherGroupsList();
    public String getJSPath();
    public Boolean isGroupAllowed(String groupName);
    public String[] getPagetypes();
    public List<String> getPagetypesList();
}
