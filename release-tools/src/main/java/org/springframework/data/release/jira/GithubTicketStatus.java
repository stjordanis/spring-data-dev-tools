/*
 * Copyright 2016 the original author or authors.
 *
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
 */

package org.springframework.data.release.jira;

import lombok.AllArgsConstructor;

/**
 * Value object for a GitHub ticket status.
 * @author Mark Paluch
 */
@AllArgsConstructor
class GithubTicketStatus implements TicketStatus {

	private final String status;

	@Override
	public String getLabel() {
		return status;
	}

	@Override
	public boolean isResolved() {
		return "closed".equalsIgnoreCase(status);
	}
}