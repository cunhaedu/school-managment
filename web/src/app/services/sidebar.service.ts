import { Injectable, computed, inject, signal } from '@angular/core';
import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';
import { toSignal } from '@angular/core/rxjs-interop';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root',
})
export class IsMobileService {
  private breakpointObserver = inject(BreakpointObserver);

  private isMobileSignal = toSignal(
    this.breakpointObserver.observe([Breakpoints.Handset]).pipe(
      map(result => result.matches)
    ),
    { initialValue: false }
  );

  isMobile = computed(() => this.isMobileSignal());

  sidebarState = signal<'expanded' | 'collapsed'>('collapsed');
}
