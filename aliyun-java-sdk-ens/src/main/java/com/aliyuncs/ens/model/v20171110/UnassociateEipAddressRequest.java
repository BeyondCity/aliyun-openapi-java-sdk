/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UnassociateEipAddressRequest extends RpcAcsRequest<UnassociateEipAddressResponse> {
	   

	private String eip;

	private String ensRegionId;

	private String instanceIdInternetIp;

	private String version;
	public UnassociateEipAddressRequest() {
		super("Ens", "2017-11-10", "UnassociateEipAddress", "ens");
		setMethod(MethodType.POST);
	}

	public String getEip() {
		return this.eip;
	}

	public void setEip(String eip) {
		this.eip = eip;
		if(eip != null){
			putQueryParameter("Eip", eip);
		}
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
		if(ensRegionId != null){
			putQueryParameter("EnsRegionId", ensRegionId);
		}
	}

	public String getInstanceIdInternetIp() {
		return this.instanceIdInternetIp;
	}

	public void setInstanceIdInternetIp(String instanceIdInternetIp) {
		this.instanceIdInternetIp = instanceIdInternetIp;
		if(instanceIdInternetIp != null){
			putQueryParameter("InstanceIdInternetIp", instanceIdInternetIp);
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	@Override
	public Class<UnassociateEipAddressResponse> getResponseClass() {
		return UnassociateEipAddressResponse.class;
	}

}
