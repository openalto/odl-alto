/*
 * Copyright © 2015 Yale University and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.alto.basic.endpointcostservice.supportservice.service;

public interface NetworkPortStatisticsService {

    Long getCurrentTxSpeed(String tpId, Metric metric);

    Long getCurrentRxSpeed(String tpId, Metric metric);

    enum Metric {BITSPERSECOND, BYTESPERSECOND};
}
