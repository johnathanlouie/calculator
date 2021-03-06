/*
 * Copyright 2018 Johnathan Louie.
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
package io.jlouie.calculator;

/**
 *
 * @author Johnathan Louie
 */
public class UnknownOperatorException extends RuntimeException {

    /**
     * Creates a new instance of <code>UnknownOperator</code> without detail
     * message.
     */
    public UnknownOperatorException() {
    }

    /**
     * Constructs an instance of <code>UnknownOperator</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public UnknownOperatorException(String msg) {
        super(msg);
    }
}
