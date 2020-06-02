/*
 * Copyright © 2015 Yale University and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.alto.basic.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AltoTopologyTest {
    private AltoTopology topology;

    @Before
    public void loadTopology() {
        topology = new AltoTopology();
        Long nodes[] = {168430089L, 168430082L, 168430084L, 168430087L, 673720322L, 168430085L,
                168430086L, 168430088L, 168430081L, 168430083L};
        for (Long n : nodes) {
            topology.addNode(n);
        }
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKAgEDAAQdHR0CAQQABB0dHQE=", 168430089L, 168430082L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBAEDAAQtLS0CAQQABC0tLQE=", 168430085L, 168430084L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAARZWVkBAQQABFlZWQI=", 168430088L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBAEDAAQODg4BAQQABA4ODgI=", 168430081L, 168430084L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKBwEDAARPT08CAQQABE9PTwE=", 168430089L, 168430087L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKAwEDAAQnJycCAQQABCcnJwE=", 168430089L, 168430083L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAEKCgoAgEDAARaWloBAQQABFpaWgI=", 168430089L, 673720322L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAEKCgoAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKBAEDAAQoKCgCAQQABCgoKAE=", 673720322L, 168430084L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKAwEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAAQnJycBAQQABCcnJwI=", 168430083L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAEKCgoAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAARaWloCAQQABFpaWgE=", 673720322L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCAEDAARZWVkCAQQABFlZWQE=", 168430089L, 168430088L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAgEDAAQaGhoBAQQABBoaGgI=", 168430086L, 168430082L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKBAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAEKCgoAgEDAAQoKCgBAQQABCgoKAI=", 168430084L, 673720322L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBAEDAAQuLi4CAQQABC4uLgE=", 168430086L, 168430084L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBQEDAAQtLS0BAQQABC0tLQI=", 168430084L, 168430085L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKBwEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAARPT08BAQQABE9PTwI=", 168430087L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBgEDAAQaGhoCAQQABBoaGgE=", 168430082L, 168430086L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBQEDAAQZGRkBAQQABBkZGQI=", 168430082L, 168430085L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAgEDAAQZGRkCAQQABBkZGQE=", 168430085L, 168430082L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAQEDAAQODg4CAQQABA4ODgE=", 168430084L, 168430081L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBgEDAAQuLi4BAQQABC4uLgI=", 168430084L, 168430086L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAgEDAAQMDAwBAQQABAwMDAI=", 168430081L, 168430082L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAAQdHR0BAQQABB0dHQI=", 168430082L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAQEDAAQMDAwCAQQABAwMDAE=", 168430082L, 168430081L);
        topology.buildDistance();
    }

    @Test
    public void getDistance() {
        int dist = topology.getDistance(168430089L, 168430082L);
        assertEquals(1, dist);
    }
}