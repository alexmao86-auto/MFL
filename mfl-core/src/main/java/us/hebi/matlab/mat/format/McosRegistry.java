/*-
 * #%L
 * MAT File Library
 * %%
 * Copyright (C) 2018 HEBI Robotics
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
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
 * #L%
 */

package us.hebi.matlab.mat.format;

import java.util.ArrayList;
import java.util.List;

/**
 * Keeps track of reference classes that require a backing object
 */
class McosRegistry {

    synchronized McosReference register(McosReference reference) {
        this.references.add(reference);
        return reference;
    }

    List<McosReference> getReferences() {
        return references;
    }

    private final List<McosReference> references = new ArrayList<McosReference>();

}
