import {Route} from '@vaadin/router';
import './views/helloworld/hello-world-view';
import './views/main-layout';

export type ViewRoute = Route & {
    title?: string;
    icon?: string;
    children?: ViewRoute[];
};

export const views: ViewRoute[] = [
    // place routes below (more info https://vaadin.com/docs/latest/fusion/routing/overview)
    {
        path: '',
        component: 'hello-world-view',
        icon: '',
        title: '',
    },
    {
        path: 'hello',
        component: 'hello-world-view',
        icon: 'la la-globe',
        title: 'Hello World',
    },
    {
        path: 'card-list',
        component: 'card-list-view',
        icon: 'la la-list',
        title: 'Card List',
        action: async (_context, _command) => {
            await import('./views/cardlist/card-list-view');
            return;
        },
    },
    {
        path: 'master-detail',
        component: 'master-detail-view',
        icon: 'la la-columns',
        title: 'Master-Detail',
        action: async (_context, _command) => {
            await import('./views/masterdetail/master-detail-view');
            return;
        },
    },
    {
        path: 'person-form',
        component: 'person-form-view',
        icon: 'la la-user',
        title: 'Person Form',
        action: async (_context, _command) => {
            await import('./views/personform/person-form-view');
            return;
        },
    },
    {
        path: 'about',
        component: 'about-view',
        icon: 'la la-file',
        title: 'About',
        action: async (_context, _command) => {
            await import('./views/about/about-view');
            return;
        },
    },
];
export const routes: ViewRoute[] = [
    {
        path: '',
        component: 'main-layout',
        children: [...views],
    },
];
