/*
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.litho.testing.util;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.EventHandler;
import com.facebook.litho.Transition;

public abstract class InlineLayoutSpec extends Component<InlineLayoutSpec> {

  @Override
  protected ComponentLayout onCreateLayout(ComponentContext c, Component<?> component) {
    return ((InlineLayoutSpec) component).onCreateLayout(c);
  }

  @Override
  public Object dispatchOnEvent(EventHandler eventHandler, Object eventState) {
    // no-op
    return null;
  }

  @Override
  protected Transition onCreateTransition(ComponentContext c, Component<?> component) {
    return ((InlineLayoutSpec) component).onCreateTransition(c);
  }

  @Override
  public String getSimpleName() {
    // You may want to override this in your inline spec, but it's not required.
    return "InlineLayout";
  }

  protected abstract ComponentLayout onCreateLayout(ComponentContext c);

  protected Transition onCreateTransition(ComponentContext c) {
    return null;
  }
}
