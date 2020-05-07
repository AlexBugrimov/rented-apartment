import Home from './pages/Home';
import Tariffs from './pages/Tariffs';
import Counts from './pages/Counts';
import Contacts from './pages/Contacts';
import Settings from './pages/Settings';
import Payment from './pages/Payment';
import NoMatch from './pages/NoMatch';

import tariffs from './assept/tariffs.svg';
import home from './assept/home.svg';
import counts from './assept/counts.svg';
import payment from './assept/payment.svg';
import {faHome, faProjectDiagram, faBlog, faCreditCard, faCogs, faAddressBook} from "@fortawesome/free-solid-svg-icons";

export default () => [
  {
    item: 'home',
    exact: true,
    label: 'Домой',
    icon: faHome,
    route: '/',
    page: Home
  },
  {
    item: 'tariffs',
    exact: true,
    label: 'Тарифы',
    icon: faProjectDiagram,
    route: '/tariffs',
    page: Tariffs
  },
  {
    item: 'counts',
    exact: true,
    label: 'Счетчики',
    icon: faBlog,
    route: '/counts',
    page: Counts
  },
  {
    item: 'payment',
    exact: true,
    label: 'Оплата',
    icon: faCreditCard,
    route: '/payment',
    page: Payment
  },
  {
    item: 'contacts',
    exact: true,
    label: 'Контакты',
    icon: faAddressBook,
    route: '/contacts',
    page: Contacts
  },
  {
    item: 'settings',
    exact: true,
    label: 'Настройки',
    icon: faCogs,
    route: '/settings',
    page: Settings
  },
  {
    item: 'noMatch',
    exact: false,
    label: '404',
    icon: null,
    route: null,
    page: NoMatch
  },
]
