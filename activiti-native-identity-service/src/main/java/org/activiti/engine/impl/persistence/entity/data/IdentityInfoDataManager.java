/*
 * Copyright 2017 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.engine.impl.persistence.entity.data;

import org.activiti.engine.impl.persistence.entity.IdentityInfoEntity;

import java.util.List;

/**

 */
public interface IdentityInfoDataManager extends DataManager<IdentityInfoEntity> {

  List<IdentityInfoEntity> findIdentityInfoDetails(String identityInfoId);
  
  List<IdentityInfoEntity> findIdentityInfoByUserId(String userId);
  
  IdentityInfoEntity findUserInfoByUserIdAndKey(String userId, String key);

  List<String> findUserInfoKeysByUserIdAndType(String userId, String type);
  
}